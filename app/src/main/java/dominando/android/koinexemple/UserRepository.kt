package dominando.android.koinexemple

class UserRepository(private val api: GitHubApi) {
    fun getAllUsers() = api.getUsers()
}