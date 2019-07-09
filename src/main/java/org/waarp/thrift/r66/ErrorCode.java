/**
 * Autogenerated by Thrift Compiler (0.9.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package org.waarp.thrift.r66;

public enum ErrorCode implements org.apache.thrift.TEnum {
    /**
     * Code stands for initialization ok (internal connection, authentication)
     */
    InitOk(0),
    /**
     * Code stands for pre processing ok
     */
    PreProcessingOk(1),
    /**
     * Code stands for transfer OK
     */
    TransferOk(2),
    /**
     * Code stands for post processing ok
     */
    PostProcessingOk(3),
    /**
     * Code stands for All action are completed ok
     */
    CompleteOk(4),
    /**
     * Code stands for connection is impossible (remote or local reason)
     */
    ConnectionImpossible(5),
    /**
     * Code stands for connection is impossible now due to limits(remote or local reason)
     */
    ServerOverloaded(6),
    /**
     * Code stands for bad authentication (remote or local)
     */
    BadAuthent(7),
    /**
     * Code stands for External operation in error (pre, post or error processing)
     */
    ExternalOp(8),
    /**
     * Code stands for Transfer is in error
     */
    TransferError(9),
    /**
     * Code stands for Transfer in error due to MD5
     */
    MD5Error(10),
    /**
     * Code stands for Network disconnection
     */
    Disconnection(11),
    /**
     * Code stands for Remote Shutdown
     */
    RemoteShutdown(12),
    /**
     * Code stands for final action (like moving file) is in error
     */
    FinalOp(13),
    /**
     * Code stands for unimplemented feature
     */
    Unimplemented(14),
    /**
     * Code stands for shutdown is in progress
     */
    Shutdown(15),
    /**
     * Code stands for a remote error is received
     */
    RemoteError(16),
    /**
     * Code stands for an internal error
     */
    Internal(17),
    /**
     * Code stands for a request of stopping transfer
     */
    StoppedTransfer(18),
    /**
     * Code stands for a request of canceling transfer
     */
    CanceledTransfer(19),
    /**
     * Warning in execution
     */
    Warning(20),
    /**
     * Code stands for unknown type of error
     */
    Unknown(21),
    /**
     * Code stands for a request that is already remotely finished
     */
    QueryAlreadyFinished(22),
    /**
     * Code stands for request that is still running
     */
    QueryStillRunning(23),
    /**
     * Code stands for not known host
     */
    NotKnownHost(24),
    /**
     * Code stands for self requested host starting request is invalid
     */
    LoopSelfRequestedHost(25),
    /**
     * Code stands for request should exist but is not found on remote host
     */
    QueryRemotelyUnknown(26),
    /**
     * Code stands for File not found error
     */
    FileNotFound(27),
    /**
     * Code stands for Command not found error
     */
    CommandNotFound(28),
    /**
     * Code stands for a request in PassThroughMode and required action is incompatible with this
     * mode
     */
    PassThroughMode(29),
    /**
     * Code stands for running step
     */
    Running(30);

    private final int value;

    private ErrorCode(int value) {
        this.value = value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static ErrorCode findByValue(int value) {
        switch (value) {
        case 0:
            return InitOk;
        case 1:
            return PreProcessingOk;
        case 2:
            return TransferOk;
        case 3:
            return PostProcessingOk;
        case 4:
            return CompleteOk;
        case 5:
            return ConnectionImpossible;
        case 6:
            return ServerOverloaded;
        case 7:
            return BadAuthent;
        case 8:
            return ExternalOp;
        case 9:
            return TransferError;
        case 10:
            return MD5Error;
        case 11:
            return Disconnection;
        case 12:
            return RemoteShutdown;
        case 13:
            return FinalOp;
        case 14:
            return Unimplemented;
        case 15:
            return Shutdown;
        case 16:
            return RemoteError;
        case 17:
            return Internal;
        case 18:
            return StoppedTransfer;
        case 19:
            return CanceledTransfer;
        case 20:
            return Warning;
        case 21:
            return Unknown;
        case 22:
            return QueryAlreadyFinished;
        case 23:
            return QueryStillRunning;
        case 24:
            return NotKnownHost;
        case 25:
            return LoopSelfRequestedHost;
        case 26:
            return QueryRemotelyUnknown;
        case 27:
            return FileNotFound;
        case 28:
            return CommandNotFound;
        case 29:
            return PassThroughMode;
        case 30:
            return Running;
        default:
            return null;
        }
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }
}
