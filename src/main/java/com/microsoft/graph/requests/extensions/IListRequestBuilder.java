// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the List Request Builder.
 */
public interface IListRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IListRequest instance
     */
    IListRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IListRequest instance
     */
    IListRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder createdByUser();

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder lastModifiedByUser();

    IColumnDefinitionCollectionRequestBuilder columns();

    IColumnDefinitionRequestBuilder columns(final String id);

    IContentTypeCollectionRequestBuilder contentTypes();

    IContentTypeRequestBuilder contentTypes(final String id);

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IListItemCollectionRequestBuilder items();

    IListItemRequestBuilder items(final String id);

    ISubscriptionCollectionRequestBuilder subscriptions();

    ISubscriptionRequestBuilder subscriptions(final String id);

}