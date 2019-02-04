// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Get Recent Notebooks Collection Request.
 */
public class NotebookGetRecentNotebooksCollectionRequest extends BaseCollectionRequest<NotebookGetRecentNotebooksCollectionResponse, INotebookGetRecentNotebooksCollectionPage> implements INotebookGetRecentNotebooksCollectionRequest {


    /**
     * The request for this NotebookGetRecentNotebooks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookGetRecentNotebooksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, NotebookGetRecentNotebooksCollectionResponse.class, INotebookGetRecentNotebooksCollectionPage.class);
    }


    public void get(final ICallback<INotebookGetRecentNotebooksCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public INotebookGetRecentNotebooksCollectionPage get() throws ClientException {
        final NotebookGetRecentNotebooksCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public INotebookGetRecentNotebooksCollectionPage buildFromResponse(final NotebookGetRecentNotebooksCollectionResponse response) {
        final INotebookGetRecentNotebooksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new NotebookGetRecentNotebooksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* includePersonalNotebooks */ null);
        } else {
            builder = null;
        }
        final INotebookGetRecentNotebooksCollectionPage page = new NotebookGetRecentNotebooksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public INotebookGetRecentNotebooksCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (INotebookGetRecentNotebooksCollectionRequest)this;
    }

}
