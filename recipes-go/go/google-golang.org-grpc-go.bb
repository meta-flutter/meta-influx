DESCRIPTION = "google.golang.org/grpc"

GO_IMPORT = "google.golang.org/grpc"

inherit go

SRC_URI = "git://github.com/grpc/grpc-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "0e8b58d22f34640cb17dbbed1c8aef3b8dcc0e97"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a4bad33881612090c6035d8393175996"

FILES_${PN} += "${GOBIN_FINAL}/*"
