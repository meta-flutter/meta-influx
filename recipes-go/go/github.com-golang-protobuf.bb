DESCRIPTION = "Go support for Google's protocol buffers"
SECTION = "net"
HOMEPAGE = "https://github.com/golang/protobuf"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=14db3a56c3796a940ba32948a15f97d0"

DEPENDS = "golang.org-x-net"

GO_IMPORT = "github.com/golang/protobuf"

SRC_URI = "\
	git://github.com/golang/protobuf.git;protocol=https;name=protobuf;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
	"

SRCREV_protobuf = "2bba0603135d7d7f5cb73b2125beeda19c09f4ef"

inherit go

do_install:append:class-target() {
	find "${D}${GOROOT_FINAL}" \( -name \*.sh -o -name \*.bash \) -delete
}
