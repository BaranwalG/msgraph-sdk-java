// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DriveItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Search Parameter Set.
 */
public class DriveSearchParameterSet {
    /**
     * The q.
     * 
     */
    @SerializedName(value = "q", alternate = {"Q"})
    @Expose
	@Nullable
    public String q;


    /**
     * Instiaciates a new DriveSearchParameterSet
     */
    public DriveSearchParameterSet() {}
    /**
     * Instiaciates a new DriveSearchParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveSearchParameterSet(@Nonnull final DriveSearchParameterSetBuilder builder) {
        this.q = builder.q;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveSearchParameterSetBuilder newBuilder() {
        return new DriveSearchParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveSearchParameterSet
     */
    public static final class DriveSearchParameterSetBuilder {
        /**
         * The q parameter value
         */
        @Nullable
        protected String q;
        /**
         * Sets the Q
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveSearchParameterSetBuilder withQ(@Nullable final String val) {
            this.q = val;
            return this;
        }
        /**
         * Instanciates a new DriveSearchParameterSetBuilder
         */
        @Nullable
        protected DriveSearchParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveSearchParameterSet build() {
            return new DriveSearchParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.q != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("q", q));
        }
        return result;
    }
}
