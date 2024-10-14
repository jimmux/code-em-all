<script lang="ts">
  import { T, useTask, extend, useThrelte } from "@threlte/core";
  import { interactivity } from "@threlte/extras";
  import { spring } from "svelte/motion";
  import { OrbitControls } from "three/examples/jsm/controls/OrbitControls.js";
  import { DEG2RAD } from "three/src/math/MathUtils.js";

  import HelloWorld from "./models/HelloWorld.svelte";

  interactivity();
  const scale = spring(1);
  let rotation = 0;
  useTask((delta) => {
    rotation += delta / 10;
  });

  extend({ OrbitControls });
  const { renderer, invalidate } = useThrelte();
</script>

<T.PerspectiveCamera makeDefault let:ref position={[50, 40, 40]}>
  <T.OrbitControls
    args={[ref, renderer.domElement]}
    minPolarAngle={DEG2RAD * 25}
    maxPolarAngle={DEG2RAD * 85}
    on:change={invalidate}
  />
</T.PerspectiveCamera>

<T.AmbientLight args={[0xfff0d0, 0.2]} />
<T.PointLight args={[0xfffff0, 1500]} position={[10, 30, 20]} castShadow />

<HelloWorld
  rotation.y={rotation}
  position.y={-16}
  scale={$scale}
  on:pointerenter={() => scale.set(1.2)}
  on:pointerleave={() => scale.set(1)}
  castShadow
/>

<!-- todo: Where did the shadow go? -->
<T.Mesh position.y={-16} rotation.x={-Math.PI / 2} receiveShadow>
  <T.CircleGeometry args={[30, 40]} />
  <T.MeshStandardMaterial color="white" />
</T.Mesh>
