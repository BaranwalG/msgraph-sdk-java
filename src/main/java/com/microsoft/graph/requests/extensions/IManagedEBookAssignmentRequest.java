// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed EBook Assignment Request.
 */
public interface IManagedEBookAssignmentRequest extends IHttpRequest {

    /**
     * Gets the ManagedEBookAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedEBookAssignment> callback);

    /**
     * Gets the ManagedEBookAssignment from the service
     *
     * @return the ManagedEBookAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBookAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedEBookAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedEBookAssignment with a source
     *
     * @param sourceManagedEBookAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedEBookAssignment sourceManagedEBookAssignment, final ICallback<ManagedEBookAssignment> callback);

    /**
     * Patches this ManagedEBookAssignment with a source
     *
     * @param sourceManagedEBookAssignment the source object with updates
     * @return the updated ManagedEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBookAssignment patch(final ManagedEBookAssignment sourceManagedEBookAssignment) throws ClientException;

    /**
     * Posts a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedEBookAssignment newManagedEBookAssignment, final ICallback<ManagedEBookAssignment> callback);

    /**
     * Posts a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the new object to create
     * @return the created ManagedEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedEBookAssignment post(final ManagedEBookAssignment newManagedEBookAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedEBookAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedEBookAssignmentRequest expand(final String value);

}

