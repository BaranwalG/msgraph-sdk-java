// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ChatType;
import com.microsoft.graph.models.TeamworkOnlineMeetingInfo;
import com.microsoft.graph.models.TeamsAppInstallation;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.TeamsTab;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.ConversationMemberCollectionPage;
import com.microsoft.graph.requests.ChatMessageCollectionPage;
import com.microsoft.graph.requests.TeamsTabCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat.
 */
public class Chat extends Entity implements IJsonBackedObject {


    /**
     * The Chat Type.
     * Specifies the type of chat. Possible values are: group, oneOnOne, meeting, unknownFutureValue.
     */
    @SerializedName(value = "chatType", alternate = {"ChatType"})
    @Expose
	@Nullable
    public ChatType chatType;

    /**
     * The Created Date Time.
     * Date and time at which the chat was created. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Last Updated Date Time.
     * Date and time at which the chat was renamed or list of members were last changed. Read-only.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Online Meeting Info.
     * Represents details about an online meeting. If the chat isn't associated with an online meeting, the property is empty. Read-only.
     */
    @SerializedName(value = "onlineMeetingInfo", alternate = {"OnlineMeetingInfo"})
    @Expose
	@Nullable
    public TeamworkOnlineMeetingInfo onlineMeetingInfo;

    /**
     * The Tenant Id.
     * The identifier of the tenant in which the chat was created. Read-only.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The Topic.
     * (Optional) Subject or topic for the chat. Only available for group chats.
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
	@Nullable
    public String topic;

    /**
     * The Web Url.
     * The URL for the chat in Microsoft Teams. The URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Installed Apps.
     * A collection of all the apps in the chat. Nullable.
     */
    @SerializedName(value = "installedApps", alternate = {"InstalledApps"})
    @Expose
	@Nullable
    public TeamsAppInstallationCollectionPage installedApps;

    /**
     * The Members.
     * A collection of all the members in the chat. Nullable.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public ConversationMemberCollectionPage members;

    /**
     * The Messages.
     * A collection of all the messages in the chat. Nullable.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
	@Nullable
    public ChatMessageCollectionPage messages;

    /**
     * The Tabs.
     * A collection of all the tabs in the chat. Nullable.
     */
    @SerializedName(value = "tabs", alternate = {"Tabs"})
    @Expose
	@Nullable
    public TeamsTabCollectionPage tabs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("installedApps")) {
            installedApps = serializer.deserializeObject(json.get("installedApps"), TeamsAppInstallationCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), ConversationMemberCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages"), ChatMessageCollectionPage.class);
        }

        if (json.has("tabs")) {
            tabs = serializer.deserializeObject(json.get("tabs"), TeamsTabCollectionPage.class);
        }
    }
}
