package me.tomsdevsn.hetznercloud.objects.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.tomsdevsn.hetznercloud.objects.general.PrimaryIP;

@Data
public class PrimaryIPResponse {

    @JsonProperty("primary_ip")
    public PrimaryIP primaryIP;
}
