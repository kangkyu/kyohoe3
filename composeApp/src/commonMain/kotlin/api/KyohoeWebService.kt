package api

import io.ktor.client.HttpClient
import io.ktor.client.request.headers
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.path
import utils.get

class KyohoeWebService(private val client: HttpClient) {
    suspend fun getPosting(postingId: Int): Result<String> = client.get {
        url { path("postings/$postingId") }
        headers {
            append(HttpHeaders.ContentType, ContentType.Application.Json.toString())
            append(HttpHeaders.Accept, ContentType.Application.Json.toString())
        }
    }
}
