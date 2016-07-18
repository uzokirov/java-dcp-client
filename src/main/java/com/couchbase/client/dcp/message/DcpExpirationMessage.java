package com.couchbase.client.dcp.message;

import com.couchbase.client.deps.io.netty.buffer.ByteBuf;

import static com.couchbase.client.dcp.message.MessageUtil.DCP_DELETION_OPCODE;
import static com.couchbase.client.dcp.message.MessageUtil.DCP_EXPIRATION_OPCODE;

public enum DcpExpirationMessage {
    ;

    public static boolean is(final ByteBuf buffer) {
        return buffer.getByte(0) == MessageUtil.MAGIC_REQ && buffer.getByte(1) == DCP_EXPIRATION_OPCODE;
    }

}
