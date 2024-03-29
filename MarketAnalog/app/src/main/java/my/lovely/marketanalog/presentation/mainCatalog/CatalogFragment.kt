package my.lovely.marketanalog.presentation.mainCatalog

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.marketanalog.R
import my.lovely.marketanalog.databinding.FragmentCatalogBinding

const val REQUEST_LOCATION_PERMISSION = 1

@AndroidEntryPoint
class CatalogFragment : Fragment(R.layout.fragment_catalog) {

    private val catalogViewModel: CatalogViewModel by viewModels()
    private lateinit var adapter: CatalogAdapter
    private lateinit var binding: FragmentCatalogBinding
    private lateinit var bundle: Bundle
    private lateinit var errorContainer: LinearLayout
    private lateinit var btErrorTryAgain: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCatalogBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requestPermission()

        adapter = CatalogAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        errorContainer = requireView().findViewById(R.id.errorContainer)
        btErrorTryAgain = requireView().findViewById(R.id.btErrorTryAgain)

        catalogViewModel.catalogResponse()
        catalogViewModel.getDate()

        catalogViewModel.progressBar.observe(viewLifecycleOwner) {
            if (it == true) {
                binding.progressBarCatalog.visibility = View.VISIBLE
                binding.recyclerView.visibility = View.GONE
                errorContainer.visibility = View.GONE
            } else {
                binding.progressBarCatalog.visibility = View.GONE
            }
        }

        catalogViewModel.catalog.observe(viewLifecycleOwner) { result ->
            if (result != null) {
                adapter.setCatalogsList(result.catalog)
                errorContainer.visibility = View.GONE
                binding.recyclerView.visibility = View.VISIBLE
            } else {
                errorContainer.visibility = View.VISIBLE
                binding.recyclerView.visibility = View.GONE
            }
        }

        catalogViewModel.date.observe(viewLifecycleOwner) {
            binding.tvMainDate.text = it
        }

        catalogViewModel.location.observe(viewLifecycleOwner) {
            binding.tvMainCity.text = it
        }

        adapter.setOnItemClickListener(object : CatalogAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                bundle = Bundle()
                bundle.putString("Category", adapter.catalogList[position].name)
            }
        })

        btErrorTryAgain.setOnClickListener {
            catalogViewModel.catalogResponse()
        }
    }

    fun requestPermission() {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(
                    android.Manifest.permission.ACCESS_FINE_LOCATION,
                    android.Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                REQUEST_LOCATION_PERMISSION
            )
            catalogViewModel.getLocation()
        } else {
            catalogViewModel.getLocation()
        }
    }


}