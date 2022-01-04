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
import com.microsoft.graph.models.IdentitySource;
import com.microsoft.graph.models.ConnectedOrganizationState;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connected Organization.
 */
public class ConnectedOrganization extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description of the connected organization.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the connected organization. Supports $filter (eq).
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Identity Sources.
     * The identity sources in this connected organization, one of azureActiveDirectoryTenant, domainIdentitySource or externalDomainFederation. Nullable.
     */
    @SerializedName(value = "identitySources", alternate = {"IdentitySources"})
    @Expose
	@Nullable
    public java.util.List<IdentitySource> identitySources;

    /**
     * The Modified Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The State.
     * The state of a connected organization defines whether assignment policies with requestor scope type AllConfiguredConnectedOrganizationSubjects are applicable or not.  The possible values are: configured, proposed, unknownFutureValue.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ConnectedOrganizationState state;

    /**
     * The External Sponsors.
     * Nullable.
     */
    @SerializedName(value = "externalSponsors", alternate = {"ExternalSponsors"})
    @Expose
	@Nullable
    public DirectoryObjectCollectionPage externalSponsors;

    /**
     * The Internal Sponsors.
     * Nullable.
     */
    @SerializedName(value = "internalSponsors", alternate = {"InternalSponsors"})
    @Expose
	@Nullable
    public DirectoryObjectCollectionPage internalSponsors;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("externalSponsors")) {
            externalSponsors = serializer.deserializeObject(json.get("externalSponsors"), DirectoryObjectCollectionPage.class);
        }

        if (json.has("internalSponsors")) {
            internalSponsors = serializer.deserializeObject(json.get("internalSponsors"), DirectoryObjectCollectionPage.class);
        }
    }
}
