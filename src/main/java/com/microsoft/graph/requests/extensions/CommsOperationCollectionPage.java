// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CommsOperation;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionPage;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation Collection Page.
 */
public class CommsOperationCollectionPage extends BaseCollectionPage<CommsOperation, ICommsOperationCollectionRequestBuilder> implements ICommsOperationCollectionPage {

    /**
     * A collection page for CommsOperation
     *
     * @param response the serialized CommsOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CommsOperationCollectionPage(final CommsOperationCollectionResponse response, final ICommsOperationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
