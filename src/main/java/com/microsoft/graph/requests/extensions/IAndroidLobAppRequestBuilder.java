// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidLobApp;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Lob App Request Builder.
 */
public interface IAndroidLobAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IAndroidLobAppRequest instance
     */
    IAndroidLobAppRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAndroidLobAppRequest instance
     */
    IAndroidLobAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppCategoryCollectionWithReferencesRequestBuilder categories();

    IMobileAppCategoryWithReferenceRequestBuilder categories(final String id);

    IMobileAppAssignmentCollectionRequestBuilder assignments();

    IMobileAppAssignmentRequestBuilder assignments(final String id);

    IMobileAppContentCollectionRequestBuilder contentVersions();

    IMobileAppContentRequestBuilder contentVersions(final String id);

}