// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TodoTaskList;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Todo Task List Request.
 */
public interface ITodoTaskListRequest extends IHttpRequest {

    /**
     * Gets the TodoTaskList from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TodoTaskList> callback);

    /**
     * Gets the TodoTaskList from the service
     *
     * @return the TodoTaskList from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TodoTaskList get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TodoTaskList> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TodoTaskList with a source
     *
     * @param sourceTodoTaskList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TodoTaskList sourceTodoTaskList, final ICallback<? super TodoTaskList> callback);

    /**
     * Patches this TodoTaskList with a source
     *
     * @param sourceTodoTaskList the source object with updates
     * @return the updated TodoTaskList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TodoTaskList patch(final TodoTaskList sourceTodoTaskList) throws ClientException;

    /**
     * Posts a TodoTaskList with a new object
     *
     * @param newTodoTaskList the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TodoTaskList newTodoTaskList, final ICallback<? super TodoTaskList> callback);

    /**
     * Posts a TodoTaskList with a new object
     *
     * @param newTodoTaskList the new object to create
     * @return the created TodoTaskList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TodoTaskList post(final TodoTaskList newTodoTaskList) throws ClientException;

    /**
     * Posts a TodoTaskList with a new object
     *
     * @param newTodoTaskList the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TodoTaskList newTodoTaskList, final ICallback<? super TodoTaskList> callback);

    /**
     * Posts a TodoTaskList with a new object
     *
     * @param newTodoTaskList the object to create/update
     * @return the created TodoTaskList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TodoTaskList put(final TodoTaskList newTodoTaskList) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITodoTaskListRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITodoTaskListRequest expand(final String value);

}
