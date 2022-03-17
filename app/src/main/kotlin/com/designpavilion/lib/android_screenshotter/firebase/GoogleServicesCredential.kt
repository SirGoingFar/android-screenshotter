package com.designpavilion.lib.android_screenshotter.firebase

import com.google.gson.annotations.SerializedName

data class GoogleServicesCredential(
    @field:SerializedName("client")
    val client: List<ClientItem>,

    @field:SerializedName("configuration_version")
    val configurationVersion: String,

    @field:SerializedName("project_info")
    val projectInfo: ProjectInfo
)

data class Services(
    @field:SerializedName("appinvite_service")
    val appinviteService: AppinviteService
)

data class AndroidClientInfo(
    @field:SerializedName("package_name")
    val packageName: String
)

data class ClientInfo(
    @field:SerializedName("android_client_info")
    val androidClientInfo: AndroidClientInfo,

    @field:SerializedName("mobilesdk_app_id")
    val mobilesdkAppId: String
)

data class OauthClientItem(
    @field:SerializedName("client_type")
    val clientType: Int,

    @field:SerializedName("client_id")
    val clientId: String
)

data class ClientItem(
    @field:SerializedName("client_info")
    val clientInfo: ClientInfo,

    @field:SerializedName("api_key")
    val apiKey: List<ApiKeyItem>,

    @field:SerializedName("services")
    val services: Services,

    @field:SerializedName("oauth_client")
    val oauthClient: List<OauthClientItem>
)

data class OtherPlatformOauthClientItem(
    @field:SerializedName("client_type")
    val clientType: Int,

    @field:SerializedName("client_id")
    val clientId: String
)

data class AppinviteService(
    @field:SerializedName("other_platform_oauth_client")
    val otherPlatformOauthClient: List<OtherPlatformOauthClientItem>
)

data class ApiKeyItem(
    @field:SerializedName("current_key")
    val currentKey: String
)

data class ProjectInfo(
    @field:SerializedName("storage_bucket")
    val storageBucket: String,

    @field:SerializedName("project_number")
    val projectNumber: String,

    @field:SerializedName("project_id")
    val projectId: String
)
