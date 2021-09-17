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
import com.microsoft.graph.models.UserIdentity;
import com.microsoft.graph.models.AccessReviewReviewerScope;
import com.microsoft.graph.models.AccessReviewScope;
import com.microsoft.graph.models.AccessReviewScheduleSettings;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessReviewInstanceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition.
 */
public class AccessReviewScheduleDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * User who created this review. Read-only.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public UserIdentity createdBy;

    /**
     * The Created Date Time.
     * Timestamp when the access review series was created. Supports $select and $orderBy. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description For Admins.
     * Description provided by review creators to provide more context of the review to admins. Supports $select.
     */
    @SerializedName(value = "descriptionForAdmins", alternate = {"DescriptionForAdmins"})
    @Expose
	@Nullable
    public String descriptionForAdmins;

    /**
     * The Description For Reviewers.
     * Description provided  by review creators to provide more context of the review to reviewers. Reviewers will see this description in the email sent to them requesting their review. Email notifications support up to 256 characters. Supports $select.
     */
    @SerializedName(value = "descriptionForReviewers", alternate = {"DescriptionForReviewers"})
    @Expose
	@Nullable
    public String descriptionForReviewers;

    /**
     * The Display Name.
     * Name of the access review series. Supports $select and $orderBy. Required on create.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Fallback Reviewers.
     * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. See accessReviewReviewerScope. Replaces backupReviewers. Supports $select.
     */
    @SerializedName(value = "fallbackReviewers", alternate = {"FallbackReviewers"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewReviewerScope> fallbackReviewers;

    /**
     * The Instance Enumeration Scope.
     * This property is required when scoping a review to guest users' access across all Microsoft 365 groups and determines which Microsoft 365 groups are reviewed. Each group will become a unique accessReviewInstance of the access review series.  For supported scopes, see accessReviewScope. Supports $select. For examples of options for configuring instanceEnumerationScope, see Configure the scope of your access review definition using the Microsoft Graph API.
     */
    @SerializedName(value = "instanceEnumerationScope", alternate = {"InstanceEnumerationScope"})
    @Expose
	@Nullable
    public AccessReviewScope instanceEnumerationScope;

    /**
     * The Last Modified Date Time.
     * Timestamp when the access review series was last modified. Supports $select. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Reviewers.
     * This collection of access review scopes is used to define who are the reviewers. The reviewers property is only updatable if individual users are assigned as reviewers. Required on create. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     */
    @SerializedName(value = "reviewers", alternate = {"Reviewers"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewReviewerScope> reviewers;

    /**
     * The Scope.
     * Defines the entities whose access is reviewed.  For supported scopes, see accessReviewScope. Required on create. Supports $select and $filter (contains only). For examples of options for configuring scope, see Configure the scope of your access review definition using the Microsoft Graph API.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public AccessReviewScope scope;

    /**
     * The Settings.
     * The settings for an access review series, see type definition below. Supports $select. Required on create.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public AccessReviewScheduleSettings settings;

    /**
     * The Status.
     * This read-only field specifies the status of an access review. The typical states include Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.  Supports $select, $orderby, and $filter (eq only). Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Instances.
     * If the accessReviewScheduleDefinition is a recurring access review, instances represent each recurrence. A review that does not recur will have exactly one instance. Instances also represent each unique resource under review in the accessReviewScheduleDefinition. If a review has multiple resources and multiple instances, each resource will have a unique instance for each recurrence.
     */
    @SerializedName(value = "instances", alternate = {"Instances"})
    @Expose
	@Nullable
    public AccessReviewInstanceCollectionPage instances;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("instances")) {
            instances = serializer.deserializeObject(json.get("instances"), AccessReviewInstanceCollectionPage.class);
        }
    }
}
