// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway.Inputs
{

    public sealed class InstanceImageAdditionalVolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Date of the volume creation.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The export URI of the volume.
        /// </summary>
        [Input("exportUri")]
        public Input<string>? ExportUri { get; set; }

        /// <summary>
        /// ID of the server containing the volume.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Date of volume latest update.
        /// </summary>
        [Input("modificationDate")]
        public Input<string>? ModificationDate { get; set; }

        /// <summary>
        /// The name of the image. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The organization ID the volume is associated with.
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        /// <summary>
        /// ID of the project the volume is associated with
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("server")]
        private InputMap<string>? _server;

        /// <summary>
        /// Description of the server containing the volume (in case the image is a backup from a server).
        /// </summary>
        public InputMap<string> Server
        {
            get => _server ?? (_server = new InputMap<string>());
            set => _server = value;
        }

        /// <summary>
        /// The size of the volume.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// State of the volume.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags to apply to the image.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of volume, possible values are `l_ssd` and `b_ssd`.
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        /// <summary>
        /// The zone in which the image should be created.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public InstanceImageAdditionalVolumeArgs()
        {
        }
        public static new InstanceImageAdditionalVolumeArgs Empty => new InstanceImageAdditionalVolumeArgs();
    }
}
