// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Assignment Request.
 */
public interface IDeviceCompliancePolicyAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceCompliancePolicyAssignment> callback);

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @return the DeviceCompliancePolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceCompliancePolicyAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback);

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyAssignment patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback);

    /**
     * Posts a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @return the created DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyAssignment post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceCompliancePolicyAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceCompliancePolicyAssignmentRequest expand(final String value);

}

