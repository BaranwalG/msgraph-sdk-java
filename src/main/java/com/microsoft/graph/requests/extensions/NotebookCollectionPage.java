// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.requests.extensions.NotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Collection Page.
 */
public class NotebookCollectionPage extends BaseCollectionPage<Notebook> {

    /**
     * A collection page for Notebook
     *
     * @param response the serialized NotebookCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NotebookCollectionPage(final NotebookCollectionResponse response, final NotebookCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
