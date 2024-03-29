package my.lovely.data.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseObject {

    @Volatile
    private var INSTANCE: BasketDataBase? = null

    @Provides
    @Singleton
    fun getInstance(@ApplicationContext context: Context): BasketDataBase {
        synchronized(this) {
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    BasketDataBase::class.java,
                    "basket_database"
                ).build()
            }
            return instance
        }
    }
}