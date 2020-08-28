// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.models.extensions.UsedInsight;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionPage;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionResponse;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequest;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight Collection Request.
 */
public class UsedInsightCollectionRequest extends BaseCollectionRequest<UsedInsightCollectionResponse, IUsedInsightCollectionPage> implements IUsedInsightCollectionRequest {

    /**
     * The request builder for this collection of UsedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsedInsightCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UsedInsightCollectionResponse.class, IUsedInsightCollectionPage.class);
    }

    public void get(final ICallback<IUsedInsightCollectionPage> callback) {
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

    public IUsedInsightCollectionPage get() throws ClientException {
        final UsedInsightCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UsedInsight newUsedInsight, final ICallback<UsedInsight> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UsedInsightRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newUsedInsight, callback);
    }

    public UsedInsight post(final UsedInsight newUsedInsight) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UsedInsightRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newUsedInsight);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUsedInsightCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UsedInsightCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUsedInsightCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UsedInsightCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUsedInsightCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UsedInsightCollectionRequest)this;
    }

    public IUsedInsightCollectionPage buildFromResponse(final UsedInsightCollectionResponse response) {
        final IUsedInsightCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UsedInsightCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UsedInsightCollectionPage page = new UsedInsightCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
