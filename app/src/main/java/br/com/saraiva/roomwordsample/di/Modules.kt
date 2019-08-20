package br.com.saraiva.roomwordsample.di

import androidx.room.Room
import br.com.saraiva.roomwordsample.DAO.WordRoomDatabase
import br.com.saraiva.roomwordsample.WordListAdapter
import br.com.saraiva.roomwordsample.WordViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dbModule = module {
    single {
        Room.databaseBuilder(
            get(),
            WordRoomDatabase::class.java,
            "Word_database"
        ).build()
    }

    single { get<WordRoomDatabase>().wordDao() }
}

val uiModule = module {
    factory { WordListAdapter(get()) }
}

val viewModelModule = module {
    viewModel { WordViewModel(get(), get()) }
}