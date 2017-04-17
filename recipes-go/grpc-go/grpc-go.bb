DESCRIPTION = "The Go language implementation of gRPC. HTTP/2 based RPC"
SECTION = "net"
HOMEPAGE = "https://github.com/grpc/grpc-go"
LICENSE = "MIT"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a4bad33881612090c6035d8393175996"

GO_IMPORT = "google.golang.org/grpc"
GO_IMPORT2 = "google.golang.org/genproto"

DEPENDS = "\
	github.com-golang-glog \
	github.com-golang-protobuf \
	golang.org-x-net \
	golang.org-x-oauth2 \
	"

GO_INSTALL = "\
	${GO_IMPORT} \
    ${GO_IMPORT}/codes/... \
    ${GO_IMPORT}/credentials/... \
    ${GO_IMPORT}/grpclb/... \
    ${GO_IMPORT}/grpclog/... \
    ${GO_IMPORT}/health/... \
    ${GO_IMPORT}/internal/... \
    ${GO_IMPORT}/interop/... \
    ${GO_IMPORT}/keepalive/... \
    ${GO_IMPORT}/metadata/... \
    ${GO_IMPORT}/naming/... \
    ${GO_IMPORT}/peer/... \
    ${GO_IMPORT}/reflection/... \
    ${GO_IMPORT}/stats/... \
    ${GO_IMPORT}/status/... \
    ${GO_IMPORT}/stress/... \
    ${GO_IMPORT}/tap/... \
    ${GO_IMPORT}/transport/... \
"

inherit go

SRC_URI = "git://github.com/grpc/grpc-go.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT};name=grpc\
           git://github.com/google/go-genproto.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT2};name=genproto"

SRCREV_grpc = "8a6eb0f6e96a246c7c655b0207b62255042f6fbd"
SRCREV_genproto= "411e09b969b1170a9f0c467558eb4c4c110d9c77"
