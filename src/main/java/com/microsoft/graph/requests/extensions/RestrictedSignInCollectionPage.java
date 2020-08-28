// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RestrictedSignIn;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Collection Page.
 */
public class RestrictedSignInCollectionPage extends BaseCollectionPage<RestrictedSignIn, IRestrictedSignInCollectionRequestBuilder> implements IRestrictedSignInCollectionPage {

    /**
     * A collection page for RestrictedSignIn
     *
     * @param response the serialized RestrictedSignInCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RestrictedSignInCollectionPage(final RestrictedSignInCollectionResponse response, final IRestrictedSignInCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
