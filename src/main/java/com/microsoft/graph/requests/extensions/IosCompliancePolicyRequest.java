// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Compliance Policy Request.
 */
public class IosCompliancePolicyRequest extends BaseRequest implements IIosCompliancePolicyRequest {
	
    /**
     * The request for the IosCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCompliancePolicy.class);
    }

    /**
     * Gets the IosCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosCompliancePolicy from the service
     *
     * @return the IosCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosCompliancePolicy> callback) {
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
     * Patches this IosCompliancePolicy with a source
     *
     * @param sourceIosCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosCompliancePolicy sourceIosCompliancePolicy, final ICallback<IosCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceIosCompliancePolicy);
    }

    /**
     * Patches this IosCompliancePolicy with a source
     *
     * @param sourceIosCompliancePolicy the source object with updates
     * @return the updated IosCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCompliancePolicy patch(final IosCompliancePolicy sourceIosCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCompliancePolicy);
    }

    /**
     * Creates a IosCompliancePolicy with a new object
     *
     * @param newIosCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosCompliancePolicy newIosCompliancePolicy, final ICallback<IosCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newIosCompliancePolicy);
    }

    /**
     * Creates a IosCompliancePolicy with a new object
     *
     * @param newIosCompliancePolicy the new object to create
     * @return the created IosCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosCompliancePolicy post(final IosCompliancePolicy newIosCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newIosCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosCompliancePolicyRequest)this;
     }

}

