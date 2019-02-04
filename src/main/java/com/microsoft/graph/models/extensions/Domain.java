// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DomainState;
import com.microsoft.graph.models.extensions.DomainDnsRecord;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionResponse;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain.
 */
public class Domain extends Entity implements IJsonBackedObject {


    /**
     * The Authentication Type.
     * Indicates the configured authentication type for the domain. The value is either Managed or Federated. Managed indicates a cloud managed domain where Azure AD performs user authentication.Federated indicates authentication is federated with an identity provider such as the tenant's on-premises Active Directory via Active Directory Federation Services. Not nullable
     */
    @SerializedName("authenticationType")
    @Expose
    public String authenticationType;

    /**
     * The Availability Status.
     * This property is always null except when the verify action is used. When the verify action is used, a domain entity is returned in the response. The availabilityStatus property of the domain entity in the response is either AvailableImmediately or EmailVerifiedDomainTakeoverScheduled.
     */
    @SerializedName("availabilityStatus")
    @Expose
    public String availabilityStatus;

    /**
     * The Is Admin Managed.
     * The value of the property is false if the DNS record management of the domain has been delegated to Office 365. Otherwise, the value is true. Not nullable
     */
    @SerializedName("isAdminManaged")
    @Expose
    public Boolean isAdminManaged;

    /**
     * The Is Default.
     * True if this is the default domain that is used for user creation. There is only one default domain per company. Not nullable
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Is Initial.
     * True if this is the initial domain created by Microsoft Online Services (companyname.onmicrosoft.com). There is only one initial domain per company. Not nullable
     */
    @SerializedName("isInitial")
    @Expose
    public Boolean isInitial;

    /**
     * The Is Root.
     * True if the domain is a verified root domain. Otherwise, false if the domain is a subdomain or unverified. Not nullable
     */
    @SerializedName("isRoot")
    @Expose
    public Boolean isRoot;

    /**
     * The Is Verified.
     * True if the domain has completed domain ownership verification. Not nullable
     */
    @SerializedName("isVerified")
    @Expose
    public Boolean isVerified;

    /**
     * The Supported Services.
     * The capabilities assigned to the domain.Can include 0, 1 or more of following values: Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune The values which you can add/remove using Graph API include: Email, OfficeCommunicationsOnline, YammerNot nullable
     */
    @SerializedName("supportedServices")
    @Expose
    public java.util.List<String> supportedServices;

    /**
     * The State.
     * Status of asynchronous operations scheduled for the domain.
     */
    @SerializedName("state")
    @Expose
    public DomainState state;

    /**
     * The Service Configuration Records.
     * DNS records the customer adds to the DNS zone file of the domain before the domain can be used by Microsoft Online services.Read-only, Nullable
     */
    public DomainDnsRecordCollectionPage serviceConfigurationRecords;

    /**
     * The Verification Dns Records.
     * DNS records that the customer adds to the DNS zone file of the domain before the customer can complete domain ownership verification with Azure AD.Read-only, Nullable
     */
    public DomainDnsRecordCollectionPage verificationDnsRecords;

    /**
     * The Domain Name References.
     * Read-only, Nullable
     */
    public DirectoryObjectCollectionPage domainNameReferences;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("serviceConfigurationRecords")) {
            final DomainDnsRecordCollectionResponse response = new DomainDnsRecordCollectionResponse();
            if (json.has("serviceConfigurationRecords@odata.nextLink")) {
                response.nextLink = json.get("serviceConfigurationRecords@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("serviceConfigurationRecords").toString(), JsonObject[].class);
            final DomainDnsRecord[] array = new DomainDnsRecord[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DomainDnsRecord.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            serviceConfigurationRecords = new DomainDnsRecordCollectionPage(response, null);
        }

        if (json.has("verificationDnsRecords")) {
            final DomainDnsRecordCollectionResponse response = new DomainDnsRecordCollectionResponse();
            if (json.has("verificationDnsRecords@odata.nextLink")) {
                response.nextLink = json.get("verificationDnsRecords@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("verificationDnsRecords").toString(), JsonObject[].class);
            final DomainDnsRecord[] array = new DomainDnsRecord[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DomainDnsRecord.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            verificationDnsRecords = new DomainDnsRecordCollectionPage(response, null);
        }

        if (json.has("domainNameReferences")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("domainNameReferences@odata.nextLink")) {
                response.nextLink = json.get("domainNameReferences@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("domainNameReferences").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            domainNameReferences = new DirectoryObjectCollectionPage(response, null);
        }
    }
}
