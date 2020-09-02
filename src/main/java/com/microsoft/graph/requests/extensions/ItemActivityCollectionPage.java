// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemActivity;
import com.microsoft.graph.requests.extensions.IItemActivityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionPage;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Collection Page.
 */
public class ItemActivityCollectionPage extends BaseCollectionPage<ItemActivity, IItemActivityCollectionRequestBuilder> implements IItemActivityCollectionPage {

    /**
     * A collection page for ItemActivity
     *
     * @param response the serialized ItemActivityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemActivityCollectionPage(final ItemActivityCollectionResponse response, final IItemActivityCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
