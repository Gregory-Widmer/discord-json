package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelModifyRequest.class)
public interface ChannelModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<Integer> position() { return Possible.absent(); }
    default Possible<String> topic() { return Possible.absent(); }
    default Possible<Boolean> nsfw() { return Possible.absent(); }
    @JsonProperty("rate_limit_per_user")
    default Possible<Integer> rateLimitPerUser() { return Possible.absent(); }
    default Possible<Integer> bitrate() { return Possible.absent(); }
    @JsonProperty("user_limit")
    default Possible<Integer> userLimit() { return Possible.absent(); }
    @JsonProperty("permission_overwrites")
    default Possible<List<OverwriteData>> permissionOverwrites() { return Possible.absent(); }
    @JsonProperty("parent_id")
    default Possible<Optional<String>> parentId() { return Possible.absent(); }
}
