// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Tab Collection Page.
 */
public class TeamsTabCollectionPage extends BaseCollectionPage<TeamsTab> {

    /**
     * A collection page for TeamsTab
     *
     * @param response the serialized TeamsTabCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsTabCollectionPage(final TeamsTabCollectionResponse response, final TeamsTabCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
