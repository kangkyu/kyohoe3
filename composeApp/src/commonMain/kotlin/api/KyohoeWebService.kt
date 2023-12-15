package api

import io.ktor.client.HttpClient
import io.ktor.http.path
import utils.get

class KyohoeWebService(private val client: HttpClient) {
    suspend fun getPosting(postingId: Int): Result<String> = client.get { url { path("postings/$postingId") } }
}
