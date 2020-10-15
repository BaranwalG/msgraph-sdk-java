// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Collection Page.
 */
public class HomeRealmDiscoveryPolicyCollectionPage extends BaseCollectionPage<HomeRealmDiscoveryPolicy> {

    /**
     * A collection page for HomeRealmDiscoveryPolicy
     *
     * @param response the serialized HomeRealmDiscoveryPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public HomeRealmDiscoveryPolicyCollectionPage(final HomeRealmDiscoveryPolicyCollectionResponse response, final HomeRealmDiscoveryPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
