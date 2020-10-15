// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Collection Page.
 */
public class BaseItemCollectionPage extends BaseCollectionPage<BaseItem> {

    /**
     * A collection page for BaseItem
     *
     * @param response the serialized BaseItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseItemCollectionPage(final BaseItemCollectionResponse response, final BaseItemCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
