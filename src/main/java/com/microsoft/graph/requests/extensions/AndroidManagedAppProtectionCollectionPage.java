// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidManagedAppProtection;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedAppProtectionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Collection Page.
 */
public class AndroidManagedAppProtectionCollectionPage extends BaseCollectionPage<AndroidManagedAppProtection> {

    /**
     * A collection page for AndroidManagedAppProtection
     *
     * @param response the serialized AndroidManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidManagedAppProtectionCollectionPage(final AndroidManagedAppProtectionCollectionResponse response, final AndroidManagedAppProtectionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
