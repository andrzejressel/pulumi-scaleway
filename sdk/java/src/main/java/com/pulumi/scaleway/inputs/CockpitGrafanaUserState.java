// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CockpitGrafanaUserState extends com.pulumi.resources.ResourceArgs {

    public static final CockpitGrafanaUserState Empty = new CockpitGrafanaUserState();

    /**
     * The login of the grafana user.
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    /**
     * @return The login of the grafana user.
     * 
     */
    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The password of the grafana user
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the grafana user
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * `project_id`) The ID of the project the cockpit is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the cockpit is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The role of the grafana user. Must be `editor` or `viewer`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of the grafana user. Must be `editor` or `viewer`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private CockpitGrafanaUserState() {}

    private CockpitGrafanaUserState(CockpitGrafanaUserState $) {
        this.login = $.login;
        this.password = $.password;
        this.projectId = $.projectId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CockpitGrafanaUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CockpitGrafanaUserState $;

        public Builder() {
            $ = new CockpitGrafanaUserState();
        }

        public Builder(CockpitGrafanaUserState defaults) {
            $ = new CockpitGrafanaUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param login The login of the grafana user.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The login of the grafana user.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param password The password of the grafana user
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the grafana user
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param projectId `project_id`) The ID of the project the cockpit is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the cockpit is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param role The role of the grafana user. Must be `editor` or `viewer`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the grafana user. Must be `editor` or `viewer`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public CockpitGrafanaUserState build() {
            return $;
        }
    }

}
