// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Delta Collection Page.
 */
public class DriveItemDeltaCollectionPage extends DeltaCollectionPage<DriveItem> {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized DriveItemDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemDeltaCollectionPage(final DriveItemDeltaCollectionResponse response, final DriveItemDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
