package dominando.android.koinexemple

import retrofit2.Call
import retrofit2.http.GET

interface GitHubApi {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>

}