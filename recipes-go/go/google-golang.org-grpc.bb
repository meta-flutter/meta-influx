DESCRIPTION = "google.golang.org/grpc"

GO_IMPORT = "google.golang.org/grpc"

inherit go

SRC_URI = "git://github.com/grpc/grpc;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "4d0ee2a56b71b3eae4865c6440362daebba0b5f7"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=dc0d1d7d86350a5c51c835e3cea3f896"

FILES_${PN} += "${GOBIN_FINAL}/*"

