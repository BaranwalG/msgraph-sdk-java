// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequest;
import com.microsoft.graph.requests.extensions.PlannerBucketRequest;
import com.microsoft.graph.models.extensions.PlannerBucket;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Request.
 */
public class PlannerBucketRequest extends BaseRequest implements IPlannerBucketRequest {
	
    /**
     * The request for the PlannerBucket
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucket.class);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerBucket> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @return the PlannerBucket from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PlannerBucket> callback) {
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
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerBucket sourcePlannerBucket, final ICallback<PlannerBucket> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerBucket);
    }

    /**
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @return the updated PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket patch(final PlannerBucket sourcePlannerBucket) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerBucket newPlannerBucket, final ICallback<PlannerBucket> callback) {
        send(HttpMethod.POST, callback, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket post(final PlannerBucket newPlannerBucket) throws ClientException {
        return send(HttpMethod.POST, newPlannerBucket);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerBucketRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerBucketRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerBucketRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerBucketRequest)this;
     }

}

