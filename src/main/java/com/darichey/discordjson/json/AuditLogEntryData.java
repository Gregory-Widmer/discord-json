package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuditLogEntryData.class)
public interface AuditLogEntryData {

    @JsonProperty("target_id")
    Optional<String> targetId();

    default Possible<List<AuditLogChangeData>> changes() { return Possible.absent(); }

    @JsonProperty("user_id")
    String userId();

    String id();

    @JsonProperty("action_type")
    int actionType();

    default Possible<AuditEntryInfoData> options() { return Possible.absent(); }

    default Possible<String> reason() { return Possible.absent(); }
}
