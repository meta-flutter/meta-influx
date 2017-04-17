DESCRIPTION = "The Go language implementation of gRPC. HTTP/2 based RPC"
SECTION = "net"
HOMEPAGE = "https://github.com/grpc/grpc-go"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/grpc/LICENSE;md5=a4bad33881612090c6035d8393175996"

GO_IMPORT = "google.golang.org"

PROVIDES += "golang.org-genproto"


inherit go



DEPENDS = "\
	github.com-golang-glog \
	github.com-golang-protobuf \
	golang.org-x-net \
	golang.org-x-oauth2 \
	"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "git://github.com/grpc/grpc-go.git;protocol=https;name=grpc;destsuffix=${PN}-${PV}/src/google.golang.org/grpc \
           git://github.com/google/go-genproto.git;protocol=https;name=genproto;destsuffix=${PN}-${PV}/src/google.golang.org/genproto \
           file://annotations.patch;name=genproto;destsuffix=${PN}-${PV}/src/google.golang.org/genproto"


GO_INSTALL = "\
    ${GO_IMPORT}/grpc/codes/... \
    ${GO_IMPORT}/grpc/credentials/... \
    ${GO_IMPORT}/grpc/grpclog/... \
    ${GO_IMPORT}/grpc/internal/... \
    ${GO_IMPORT}/grpc/metadata/... \
    ${GO_IMPORT}/grpc/naming/... \
    ${GO_IMPORT}/grpc/peer/... \
    ${GO_IMPORT}/grpc/transport/... \
    ${GO_IMPORT}/genproto/googleapis/... \
    ${GO_IMPORT}/genproto/protobuf/... \
"

SRCREV_grpc = "8a6eb0f6e96a246c7c655b0207b62255042f6fbd"
SRCREV_genproto= "411e09b969b1170a9f0c467558eb4c4c110d9c77"


RDEPENDS_${PN}-staticdev += "bash"
