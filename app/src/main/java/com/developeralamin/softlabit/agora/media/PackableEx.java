package com.developeralamin.softlabit.agora.media;

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}
