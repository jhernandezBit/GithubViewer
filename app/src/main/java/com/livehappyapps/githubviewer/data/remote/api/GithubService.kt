package com.livehappyapps.githubviewer.data.remote.api

import com.livehappyapps.githubviewer.model.Issue
import com.livehappyapps.githubviewer.model.Organization
import com.livehappyapps.githubviewer.model.Repo
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GithubService {

    @GET("orgs/{organization}")
    fun getOrganization(
        @Path("organization") organization: String
    ): Single<Organization>

    @GET("orgs/{owner}/repos")
    fun getRepos(
        @Path("owner") owner: String
    ): Single<List<Repo>>

    @GET("repos/{owner}/{repo}/issues")
    fun getIssues(
        @Path("owner") owner: String,
        @Path("repo") repo: String,
        @Query("state") state: String
    ): Single<List<Issue>>
}