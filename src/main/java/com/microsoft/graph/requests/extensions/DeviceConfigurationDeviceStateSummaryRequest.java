// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequest;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device State Summary Request.
 */
public class DeviceConfigurationDeviceStateSummaryRequest extends BaseRequest implements IDeviceConfigurationDeviceStateSummaryRequest {
	
    /**
     * The request for the DeviceConfigurationDeviceStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceStateSummary.class);
    }

    /**
     * Gets the DeviceConfigurationDeviceStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceConfigurationDeviceStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationDeviceStateSummary from the service
     *
     * @return the DeviceConfigurationDeviceStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceConfigurationDeviceStateSummary> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationDeviceStateSummary with a source
     *
     * @param sourceDeviceConfigurationDeviceStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationDeviceStateSummary sourceDeviceConfigurationDeviceStateSummary, final ICallback<DeviceConfigurationDeviceStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Patches this DeviceConfigurationDeviceStateSummary with a source
     *
     * @param sourceDeviceConfigurationDeviceStateSummary the source object with updates
     * @return the updated DeviceConfigurationDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStateSummary patch(final DeviceConfigurationDeviceStateSummary sourceDeviceConfigurationDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary, final ICallback<DeviceConfigurationDeviceStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the new object to create
     * @return the created DeviceConfigurationDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStateSummary post(final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationDeviceStateSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceConfigurationDeviceStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationDeviceStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceConfigurationDeviceStateSummaryRequest)this;
     }

}
