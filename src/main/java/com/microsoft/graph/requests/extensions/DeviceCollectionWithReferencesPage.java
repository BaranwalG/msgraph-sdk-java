// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Device;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DeviceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.DeviceCollectionResponse;
import com.microsoft.graph.models.extensions.Device;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Collection With References Page.
 */
public class DeviceCollectionWithReferencesPage extends BaseCollectionPage<Device> {

    /**
     * A collection page for Device
     *
     * @param response the serialized DeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCollectionWithReferencesPage(final DeviceCollectionResponse response, final DeviceCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
