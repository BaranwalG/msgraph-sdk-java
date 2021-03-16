// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assignment Request.
 */
public class DeviceCompliancePolicyAssignmentRequest extends BaseRequest<DeviceCompliancePolicyAssignment> {
	
    /**
     * The request for the DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignment.class);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @return the DeviceCompliancePolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceCompliancePolicyAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> patchAsync(@Nonnull final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyAssignment patch(@Nonnull final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> postAsync(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) {
        return sendAsync(HttpMethod.POST, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @return the created DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyAssignment post(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> putAsync(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) {
        return sendAsync(HttpMethod.PUT, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the object to create/update
     * @return the created DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicyAssignment put(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicyAssignmentRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicyAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
