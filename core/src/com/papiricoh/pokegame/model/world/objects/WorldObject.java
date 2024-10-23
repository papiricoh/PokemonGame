package com.papiricoh.pokegame.model.world.objects;

import java.util.UUID;

public class WorldObject {
    private UUID uuid;
    private String name;

    public WorldObject(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
