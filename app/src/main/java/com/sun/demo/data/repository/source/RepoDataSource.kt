package com.sun.demo.data.repository.source

import com.sun.demo.data.repository.source.remote.model.Movie
import io.reactivex.Observable

interface RepoDataSource {

    interface Remote{
        fun getMovies(): Observable<List<Movie>>
    }
}
