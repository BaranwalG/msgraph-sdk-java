// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.GroupCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.GroupCollectionResponse;
import com.microsoft.graph.models.extensions.Group;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Collection With References Page.
 */
public class GroupCollectionWithReferencesPage extends BaseCollectionPage<Group> {

    /**
     * A collection page for Group
     *
     * @param response the serialized GroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupCollectionWithReferencesPage(final GroupCollectionResponse response, final GroupCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
