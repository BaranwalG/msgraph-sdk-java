// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BookingCustomerBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Base Request.
 */
public class BookingCustomerBaseRequest extends BaseRequest<BookingCustomerBase> {
	
    /**
     * The request for the BookingCustomerBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BookingCustomerBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends BookingCustomerBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BookingCustomerBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCustomerBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingCustomerBase.class);
    }

    /**
     * Gets the BookingCustomerBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCustomerBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the BookingCustomerBase from the service
     *
     * @return the BookingCustomerBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCustomerBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCustomerBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public BookingCustomerBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BookingCustomerBase with a source
     *
     * @param sourceBookingCustomerBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCustomerBase> patchAsync(@Nonnull final BookingCustomerBase sourceBookingCustomerBase) {
        return sendAsync(HttpMethod.PATCH, sourceBookingCustomerBase);
    }

    /**
     * Patches this BookingCustomerBase with a source
     *
     * @param sourceBookingCustomerBase the source object with updates
     * @return the updated BookingCustomerBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCustomerBase patch(@Nonnull final BookingCustomerBase sourceBookingCustomerBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingCustomerBase);
    }

    /**
     * Creates a BookingCustomerBase with a new object
     *
     * @param newBookingCustomerBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCustomerBase> postAsync(@Nonnull final BookingCustomerBase newBookingCustomerBase) {
        return sendAsync(HttpMethod.POST, newBookingCustomerBase);
    }

    /**
     * Creates a BookingCustomerBase with a new object
     *
     * @param newBookingCustomerBase the new object to create
     * @return the created BookingCustomerBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCustomerBase post(@Nonnull final BookingCustomerBase newBookingCustomerBase) throws ClientException {
        return send(HttpMethod.POST, newBookingCustomerBase);
    }

    /**
     * Creates a BookingCustomerBase with a new object
     *
     * @param newBookingCustomerBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCustomerBase> putAsync(@Nonnull final BookingCustomerBase newBookingCustomerBase) {
        return sendAsync(HttpMethod.PUT, newBookingCustomerBase);
    }

    /**
     * Creates a BookingCustomerBase with a new object
     *
     * @param newBookingCustomerBase the object to create/update
     * @return the created BookingCustomerBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCustomerBase put(@Nonnull final BookingCustomerBase newBookingCustomerBase) throws ClientException {
        return send(HttpMethod.PUT, newBookingCustomerBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public BookingCustomerBaseRequest select(@Nonnull final String value) {
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
     public BookingCustomerBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

