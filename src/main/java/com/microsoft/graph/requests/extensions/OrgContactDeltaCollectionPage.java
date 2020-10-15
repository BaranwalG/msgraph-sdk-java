// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.OrgContactDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.OrgContactDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Delta Collection Page.
 */
public class OrgContactDeltaCollectionPage extends DeltaCollectionPage<OrgContact> {

    /**
     * A collection page for OrgContact.
     *
     * @param response The serialized OrgContactDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public OrgContactDeltaCollectionPage(final OrgContactDeltaCollectionResponse response, final OrgContactDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
